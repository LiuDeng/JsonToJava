package com.jsontojava;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.modeshape.common.text.Inflector;

public class Member {
	private Set<String> mModifiers;
	private String mFieldName;
	private String mJsonField;
	private String mType;
	private String mName;
	private String mDisplayName;

	public String getmTypeName() {
		return mTypeName;
	}

	public void setmTypeName(String mTypeName) {
		this.mTypeName = mTypeName;
	}

	private String mTypeName;

	public static class Builder {
		private static final Inflector mInflector = new Inflector();
		private Set<String> mModifiers;
		private String mFieldConstantName;
		private String mJsonField;
		private String mType;
		private String mName;
		private String mDisplayName;
		private boolean mPlural;
		private String mTypeName;

		public Builder() {
			mPlural = false;
			mModifiers = new HashSet<String>();
		}

		public Member.Builder setPlural(){
			mPlural = true;
			if(mType != null){
				mType = "RealmList<"+mType+">";
			}
			if(mName != null){
				mName = mInflector.pluralize(mName);
			}
			if(mDisplayName != null){
				mDisplayName = mInflector.pluralize(mDisplayName);
			}
			return this;
		}
		public Member.Builder setName(String name) {
			mDisplayName = mInflector.camelCase(name, false);
			name = "m" + name;
			if(mPlural){
				mName = mInflector.pluralize(name);
			}else{
				mName = name;
			}
			return this;
		}

		public Member.Builder setType(String type) {
			if(mPlural){
				mType = "RealmList<" + type + ">";

			}else{
				mType = type;
			}
			return this;
		}

		public Member.Builder setTypeName(String typeName) {
			mTypeName = typeName;
			return this;
		}

		public Member.Builder setJsonField(String jsonField) {
			mJsonField = jsonField;

			for (Map.Entry<String, String[]> entry : JsonToJava.TypeAliasMap.entrySet())
			{
				if (entry.getValue()[0].equals(mJsonField) && entry.getValue()[1].equals(mTypeName))
				{
					mJsonField =  entry.getKey();
				}
			}
			mFieldConstantName = "FIELD_" + mInflector.underscore(mJsonField).toUpperCase();
			return this;
		}

		public Member.Builder addModifier(String modifier) {
			mModifiers.add(modifier);
			return this;
		}
		
		public Member build(){
			if(mName.equalsIgnoreCase("m_id") && mType.equalsIgnoreCase("int")){
				mType = "Long";
			}
			Member member = new Member();
			member.setName(mName);
			member.setType(mType);
			member.setFieldName(mFieldConstantName);
			member.setJsonField(mJsonField);
			member.setDisplayName(mDisplayName);
			member.mModifiers = mModifiers;
			member.setmTypeName(mTypeName);
			return member;
			
		}




	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {

			return ((Member) obj).getName().equals(getName());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return getName().hashCode();
	}

	//首字母转大写
	public static String toUpperCaseFirstOne(String s)
	{
		if(Character.isUpperCase(s.charAt(0)))
			return s;
		else
			return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
	}

	public String getGetterSignature() {
		StringBuilder sBuilder = new StringBuilder();
		String methodName = StringUtils.removeStart(getName(), "m");

		String setPrefix = "get";
		try{
		if (getType().equals("boolean")) {
			setPrefix = "is";
		}
		}catch (NullPointerException e){
			e.printStackTrace();
		}
		methodName = toUpperCaseFirstOne(methodName);
		sBuilder.append(setPrefix).append(methodName).append("()");
		return sBuilder.toString();
	}

	public static String captureName(String name) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		return  name;
	}

	public String getSetter(Inflector inflector) {
		StringBuilder sBuilder = new StringBuilder();
		String methodName = StringUtils.removeStart(getName(), "m");
		String nameNoPrefix = methodName;
		try {
			nameNoPrefix = inflector.camelCase(methodName, false);
		}
		catch (Exception ex)
		{
			//ex.printStackTrace();
		}
		sBuilder.append("    public void set").append(toUpperCaseFirstOne(methodName)).append("(").append(getType()).append(" ")
				.append(nameNoPrefix).append(") {\n        ").append("this.").append(getName()).append(" = ").append(nameNoPrefix)
				.append(";").append("\n    }\n\n");
		return sBuilder.toString();
	}

	public String getGetter() {
		StringBuilder sBuilder = new StringBuilder();

		sBuilder.append("    public ").append(getType()).append(" ").append(getGetterSignature())
				.append(" {\n        return ").append(getName()).append(";\n    }\n\n");
		return sBuilder.toString();
	}

	public String getFieldName() {
		return mFieldName;
	}

	public void setFieldName(String fieldName) {
		this.mFieldName = fieldName;
	}

	public String getJsonField() {
		return mJsonField;
	}

	public void setJsonField(String jsonField) {
		this.mJsonField = jsonField;
	}

	public String getType() {
		return mType;
	}

	public void setType(String type) {
		this.mType = type;
	}

	public String getName() {
		//return mName;
		return getJsonField();
	}

	public void setName(String name) {
		this.mName = name;
	}
	public String getDisplayName() {
		return mDisplayName;
	}

	public void setDisplayName(String displayName) {
		this.mDisplayName = displayName;
	}
}