package receiptPrinterPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class animalPrinter implements Printable {


	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

	    if (pageIndex > 0) {
	         return NO_SUCH_PAGE;
	    }

	    Graphics2D g2d = (Graphics2D)graphics;
	    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

	    
	    String[] textLines = receiptPrinterClass.animalToPrint.split(" newline");

	    Font font = new Font(Font.MONOSPACED, Font.BOLD, 6);
	    graphics.setFont(font);
	    graphics.setColor(Color.BLACK);
	    
	    int lineHeight = graphics.getFontMetrics(font).getHeight();
	    double pageHeight = pageFormat.getImageableHeight();
	    int linesPerPage = ((int)pageHeight)/lineHeight;
	    int numBreaks = (textLines.length-1)/linesPerPage;
	    int[] pageBreaks = new int[numBreaks];
	    for (int b=0; b < numBreaks; b++) {
	        pageBreaks[b] = (b+1)*linesPerPage; 
	    }
	    int y = 0; 
	    int start = (pageIndex == 0) ? 0 : pageBreaks[pageIndex-1];
	    int end   = (pageIndex == pageBreaks.length)
	                     ? textLines.length : pageBreaks[pageIndex];
	    for (int line=start; line<end; line++) {
	        y += lineHeight;
	        graphics.drawString(textLines[line], 0, y);
	        //graphics.drawChars(textLines[line].toCharArray(), 0, 22, pageIndex, y);

	    }
	    graphics.drawString("------------------------------", 0, 2*y);


	    // tell the caller that this page is part
	    // of the printed document
	    return PAGE_EXISTS;
	}
}