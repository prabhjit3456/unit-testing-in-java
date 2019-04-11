package movies;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.junit.Assert;

class APITest {

	@Test
	void testParser() throws ParserConfigurationException, IOException, SAXException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("src/movies/sampleMovie.xml"));
		Movie myMovie = API.parseFrom(document);
		
		Movie tmp = new Movie ("green book", 1990, "asdf", "asdf");
	    Assert.assertEquals(tmp,myMovie);
	}

}
