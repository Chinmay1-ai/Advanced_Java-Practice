package controller;

import java.io.IOException;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import dao.PrescriptionDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Prescription;

@WebServlet("/downloadPrescription")
public class PrescriptionPDFServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int patientId = Integer.parseInt(request.getParameter("patientId"));

		List<Prescription> list = PrescriptionDAO.getPrescriptionsByPatient(patientId);

		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename=Prescription.pdf");

		try {

			Document document = new Document();
			PdfWriter.getInstance(document, response.getOutputStream());

			document.open();

			Font titleFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);

			Paragraph title = new Paragraph("MedixPro HMS - Prescription", titleFont);

			title.setAlignment(Element.ALIGN_CENTER);
			document.add(title);

			document.add(new Paragraph(" "));

			PdfPTable table = new PdfPTable(3);
			table.setWidthPercentage(100);

			table.addCell("Doctor");
			table.addCell("Medicines");
			table.addCell("Notes");

			for (Prescription p : list) {

				table.addCell(p.getDoctorName());
				table.addCell(p.getMedicines());
				table.addCell(p.getNotes());
			}

			document.add(table);

			document.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}