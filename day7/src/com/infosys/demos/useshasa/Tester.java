package com.infosys.demos.useshasa;
public class Tester {
   public static void main(String[] args){
    Paper paper=new Paper();
    System.out.println(paper.getParagraph()); //null'
    Pen pen=new Pen();
    // dont show us null but display an empty string   
   // When the writer writes on the paper , then it should display
   // Welcome to the code, Object oriented programming is very
   // interesting.
    Writer writer=new Writer(pen);
    writer.writeAParagraph(paper);
   
   }
 }