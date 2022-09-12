package com.infosys.demos.useshasa;
public class Writer {
private Pen pen;
// constructor/setter/getter

public Writer(Pen pen) {
	super();
	this.pen = pen;
}
public void writeAParagraph(Paper paper){
String content=pen.writes();
paper.setParagraph(content);  //"Welcome to the code, Object oriented programming is very interesting."
System.out.println(paper.getParagraph());
}

public Pen getPen() {
	return pen;
}
public void setPen(Pen pen) {
	this.pen = pen;
}

}
