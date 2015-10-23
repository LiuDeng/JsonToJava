package com.jsontojava.cli;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.jsontojava.JsonToJava;
import com.jsontojava.OutputOption;

public class Main {
	private static final String PACKAGE_NAME = "com.company";
	private static final String OUTPUT_DIR = "D:\\QiuDuanRiBao\\JsonToJava\\JsonToJavaGsonSample\\src\\";

	private static final String OPTION_PACKAGE = "package";
	private static final String OPTION_URL = "url";
	private static final String OPTION_ROOT = "class";
	private static final String OPTION_GSON = "g";
	private static final String OPTION_PARCELABLE = "p";
	private static final String OPTION_TO_STRING = "s";
	private static final String OPTION_OUTPUT_DIR = "d";


	/**
	 * @param args
	 * @throws IOException
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ParseException {
		doConvert("http://localhost:5000/", "Joke");
	}

	private static void  doConvert(String url , String baseType) throws IOException, ParseException
	{
		JsonToJava jsonToJava = new JsonToJava();
		jsonToJava.setUrl(url);
		jsonToJava.setPackage(PACKAGE_NAME);
		jsonToJava.setBaseType(baseType);
		jsonToJava.setOutputDir(OUTPUT_DIR);
		jsonToJava.addOutputOption(OutputOption.TO_STRING);
		jsonToJava.fetchJson();
		jsonToJava.outputZipFile();
	}



	private static Options createOptions(){
		Options options = new Options();
		options.addOption(OPTION_PARCELABLE, false, "Enabled implementation of Parcelable for all classes generated");
		options.addOption(OPTION_GSON,false,"Enables Gson annotations");
		options.addOption(OPTION_TO_STRING, false, "Enables overriding the toString method for new classes");
		Option rootClass = OptionBuilder.hasArg().isRequired().withDescription("The name of the root class of the feed you are parsing").create(OPTION_ROOT);
		options.addOption(rootClass);
		Option url = OptionBuilder.hasArg().isRequired().withDescription("The url of the json feed you want to parse").create(OPTION_URL);
		options.addOption(url);
		Option pack = OptionBuilder.hasArg().isRequired().withDescription("The package name for the generated classes").create(OPTION_PACKAGE);
		options.addOption(pack);
		Option dir = OptionBuilder.hasArg().isRequired().withDescription("The package name for the generated classes").create(OPTION_OUTPUT_DIR);
		options.addOption(dir);
		return options;
		
		
	}

	

	
}
