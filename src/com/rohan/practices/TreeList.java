package com.rohan.practices;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TreeList {

	TreeNode head;
	
	public void addData(String data)
	{
		TreeNode t = new TreeNode("data");
		t.parent = this.head;
	}
	
	public static void main(String[] args)
	{
		TreeList tLis = new TreeList();
		tLis.head = new TreeNode("RED");
		
		Document doc = Jsoup.connect("http://www.mit.edu/").get();
		 
		if(doc.text().contains("research")){
			System.out.println(URL);
		}
		
	
	}
}
