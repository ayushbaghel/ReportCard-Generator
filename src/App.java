import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
 
 public class App
 {
	 public static void main (String[] args){
		try{
			Document doc= new Document();
			OutputStream outStr = new FileOutputStream(new File("./assets/ReportCard.pdf"));
			PdfWriter.getInstance(doc,outStr);

			doc.open();
			Font font = new Font(Font.FontFamily.TIMES_ROMAN, 12,
                      Font.ITALIC | Font.BOLD);
			Font f1 = new Font(Font.FontFamily.TIMES_ROMAN, 16,
                      Font.ITALIC | Font.UNDERLINE  |  Font.BOLD);
			Font f2 = new Font(Font.FontFamily.TIMES_ROMAN, 10,
                      Font.ITALIC );
			Font f3 = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.ITALIC);
			
			doc.add(new Paragraph("Institute Code & Name : "));
			doc.add(new Paragraph("(029)KIET Group Of Instittions, Ghaziabad", f3));
			doc.add(new Paragraph("Course Code& Name : "+ "(04)B.TECH" , f3));
			doc.add(new Paragraph("Branch Code & Name : " + "(40)Mechanical Engineering" , f3));
			doc.add(new Paragraph("Rool No : " + "1802940053" , f3));
			doc.add(new Paragraph("Enrollment No : " + "180294004942" , f3));
			doc.add(new Paragraph("Name : " + "Ayush Singh Dhangar" , f3));
			doc.add(new Paragraph("Gender : " + "M" , f3));

			/*Image image = Image.getInstance("D:\\JAVA\\RONALDO.jpg");
			doc.add(image);*/

			doc.add(new Paragraph(" "));
			doc.add(new Paragraph("One View Result", f1));
			doc.add(new Paragraph(" "));

			doc.add(new Paragraph("Session : 2018-19 "+"Semester : 1,2 " + "Result : PASS "+"Marks:905/1350 "));
			doc.add(new Paragraph("COP:"));
			doc.add(new Paragraph(" "));

			doc.add(new Paragraph(" Semester"+": 1"));
			doc.add(new Paragraph("Even/Odd"+ ": Odd"));
			doc.add(new Paragraph("Total Subjects"+": 6"));
			doc.add(new Paragraph("Theory Subjects"+": 3"));
			doc.add(new Paragraph("Practical Subjects"+ ": 3"));
			doc.add(new Paragraph("Total Marks Obt."+ ": 437"));
			doc.add(new Paragraph("Result Status"+ ": CP(0)"));
			doc.add(new Paragraph(" SGPA" + ": 7.86"));
			doc.add(new Paragraph("DAte of Decleration"+ ": 23/02/19"));
			doc.add(new Paragraph(" "));

			float [] pointColumnWidths = {150F, 400F, 150F, 150F, 150F, 150F, 150F};	
			PdfPTable tab1 = new PdfPTable(pointColumnWidths);

			PdfPCell c1 = new PdfPCell(new Paragraph("Code", font));
			PdfPCell c2 = new PdfPCell(new Paragraph("Name", font));
			PdfPCell c3 = new PdfPCell(new Paragraph("Type", font));
			PdfPCell c4 = new PdfPCell(new Paragraph("Internal", font));
			PdfPCell c5 = new PdfPCell(new Paragraph("External", font));
			PdfPCell c6 = new PdfPCell(new Paragraph("Back paper", font));
			PdfPCell c7 = new PdfPCell(new Paragraph("Grade", font));

			tab1.addCell(c1);
			tab1.addCell(c2);
			tab1.addCell(c3);
			tab1.addCell(c4);
			tab1.addCell(c5);
			tab1.addCell(c6);
			tab1.addCell(c7);

			PdfPCell c8 = new PdfPCell(new Paragraph("KAS101", f2));
			PdfPCell c9 = new PdfPCell(new Paragraph("Physics", f2));
			PdfPCell c10 = new PdfPCell(new Paragraph("Theory", f2));
			PdfPCell c11 = new PdfPCell(new Paragraph("46", f2));
			PdfPCell c12 = new PdfPCell(new Paragraph("45", f2));
			PdfPCell c13 = new PdfPCell(new Paragraph("--", f2));
			PdfPCell c14 = new PdfPCell(new Paragraph("B", f2));
			

			tab1.addCell(c8);
			tab1.addCell(c9);
			tab1.addCell(c10);
			tab1.addCell(c11);
			tab1.addCell(c12);
			tab1.addCell(c13);
			tab1.addCell(c14);

			PdfPCell c15 = new PdfPCell(new Paragraph("KAS101", f2));
			PdfPCell c16 = new PdfPCell(new Paragraph("Mathematics 1", f2));
			PdfPCell c17 = new PdfPCell(new Paragraph("Theory", f2));
			PdfPCell c18 = new PdfPCell(new Paragraph("43", f2));
			PdfPCell c19 = new PdfPCell(new Paragraph("73", f2));
			PdfPCell c20 = new PdfPCell(new Paragraph("--", f2));
			PdfPCell c21 = new PdfPCell(new Paragraph("B+", f2));

			tab1.addCell(c15);
			tab1.addCell(c16);
			tab1.addCell(c17);
			tab1.addCell(c18);
			tab1.addCell(c19);
			tab1.addCell(c20);
			tab1.addCell(c21);

			PdfPCell c22 = new PdfPCell(new Paragraph("KEE101", f2));
			PdfPCell c23 = new PdfPCell(new Paragraph("Basic Electrical Engineering", f2));
			PdfPCell c24 = new PdfPCell(new Paragraph("Theory", f2));
			PdfPCell c25 = new PdfPCell(new Paragraph("40", f2));
			PdfPCell c26 = new PdfPCell(new Paragraph("64", f2));
			PdfPCell c27 = new PdfPCell(new Paragraph("--", f2));
			PdfPCell c28 = new PdfPCell(new Paragraph("B+", f2));

			tab1.addCell(c22);
			tab1.addCell(c23);
			tab1.addCell(c24);
			tab1.addCell(c25);
			tab1.addCell(c26);
			tab1.addCell(c27);
			tab1.addCell(c28);

			PdfPCell c29= new PdfPCell(new Paragraph("KAS101", f2));
			PdfPCell c30 = new PdfPCell(new Paragraph("Physics", f2));
			PdfPCell c31 = new PdfPCell(new Paragraph("Practical", f2));
			PdfPCell c32 = new PdfPCell(new Paragraph("19", f2));
			PdfPCell c33 = new PdfPCell(new Paragraph("19", f2));
			PdfPCell c34 = new PdfPCell(new Paragraph("--", f2));
			PdfPCell c35 = new PdfPCell(new Paragraph("--", f2));


			tab1.addCell(c29);
			tab1.addCell(c30);
			tab1.addCell(c31);
			tab1.addCell(c32);
			tab1.addCell(c33);
			tab1.addCell(c34);
			tab1.addCell(c35);

			PdfPCell c36 = new PdfPCell(new Paragraph("KEE101", f2));
			PdfPCell c37 = new PdfPCell(new Paragraph("Basic Electrical Engineering", f2));
			PdfPCell c38 = new PdfPCell(new Paragraph("Practical", f2));
			PdfPCell c39 = new PdfPCell(new Paragraph("23", f2));
			PdfPCell c40 = new PdfPCell(new Paragraph("22", f2));
			PdfPCell c41 = new PdfPCell(new Paragraph("--", f2));
			PdfPCell c42 = new PdfPCell(new Paragraph("--", f2));

			tab1.addCell(c36);
			tab1.addCell(c37);
			tab1.addCell(c38);
			tab1.addCell(c39);
			tab1.addCell(c40);
			tab1.addCell(c41);
			tab1.addCell(c42);

			PdfPCell c43 = new PdfPCell(new Paragraph("KCE101", f2));
			PdfPCell c44 = new PdfPCell(new Paragraph("Engineering Graphics & Design", f2));
			PdfPCell c45 = new PdfPCell(new Paragraph("Practical", f2));
			PdfPCell c46 = new PdfPCell(new Paragraph("24", f2));
			PdfPCell c47 = new PdfPCell(new Paragraph("19", f2));
			PdfPCell c48 = new PdfPCell(new Paragraph("--", f2));
			PdfPCell c49 = new PdfPCell(new Paragraph("A", f2));


			tab1.addCell(c43);
			tab1.addCell(c44);
			tab1.addCell(c45);
			tab1.addCell(c46);
			tab1.addCell(c47);
			tab1.addCell(c48);
			tab1.addCell(c49);




			doc.add(tab1);

			doc.close();
			outStr.close();
			System.out.println("Created");
			

			
			
		}
		catch(Exception e){
			e.printStackTrace();
		} 
	 }
 }