package movies;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class API {

	public static Movie parseFrom(Document xml) {
		xml.getDocumentElement().normalize();
		NodeList list = xml.getElementsByTagName("movie");

		String name = "";
		int year = 0;
		String director = "";
		String writer = "";

		for (int temp = 0; temp < list.getLength(); temp++) {
			Node node = list.item(temp);

			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element movie = (Element) node;
				name = movie.getAttribute("title");
				year = Integer.parseInt("Year");
				director = movie.getAttribute("director");
				writer = movie.getAttribute("writer");
			}
		}
		return new Movie(name, year, director, writer);
	}

}
