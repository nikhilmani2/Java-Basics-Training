package DAY4;

import java.io.File;

import java.io.IOException;

import java.nio.file.Path;

import java.nio.file.Paths;

 

public class FiledemoTwo {

 

	public static void main(String[] args) {

		File file = new File("D:\\DELOITTE\\Folder Ex");

		boolean b = file.exists();

		System.out.println("File already exists : "+b);

		if(b == false)

		{

			file.mkdirs();

			//file.mkdir();

			System.out.println("File created");

			

		}

		Path path = Paths.get("D:\\File Example One\\Sub Folder Ex\\text.tst");

		File file1 = new File("D:\\File Example One\\Sub Folder Ex\\Pattern_Two.java");

		boolean b1  = file1.exists();

		try

		{

		if(b1==false)

		{

			

			file1.createNewFile();

			System.out.println("File is created");

		}

		}

		catch(IOException e)

		{

			e.printStackTrace();

		}

		//file1.delete(); will delete the file text.txt

		

		//To rename a file

		File fileNew = new File("D:\\File Example One\\Sub Folder Ex\\Pattern_Two.java");

		file1.renameTo(fileNew);

		System.out.println("File is renamed");

		

		//getting the file name inside a folder

		System.out.println("The files are : "+fileNew.getName());

		fileNew.setReadOnly();

		//to check if file can read,write,execute - restriction

		boolean canRead = fileNew.canRead();

		boolean canWrite = fileNew.canWrite();

		boolean canExecute= fileNew.canExecute();

		System.out.println(canRead);

		System.out.println(canWrite);

		System.out.println(canExecute);

		

		

		//to retrieve all the files and folders inside a given path

		File f1 = new File("D:\\");

		String[] s = f1.list();

		for(String str : s)

		System.out.println("The files are : "+str);

		

		//to list only the files

				File[] s1 = f1.listFiles();

		for(File listFiles : s1)

			if(listFiles.isFile())

			System.out.println("The lst of files are : "+listFiles);

		

		//to print only text files

		

		 System.out.println(path.getRoot());

	      System.out.println(path.getParent());

	      System.out.println(path.getNameCount());

	      System.out.println(path.getName(0));

	      System.out.println(path.subpath(0, 2));

	      System.out.println(path.toString());

	    

	      

	}

 

}