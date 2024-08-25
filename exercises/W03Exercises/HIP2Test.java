import java.io.*;
import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;
import java.math.BigDecimal;

public class HIP2Test {

	public static void main(String[] argv) {
		try {
			HIP2Reader h = new HIP2Reader(argv[0]);

			JsonGeneratorFactory factory = Json.createGeneratorFactory(null);
			Writer w = new FileWriter("output.json");
			JsonGenerator generator = factory.createGenerator(w);
			generator.writeStartObject();
			generator.writeStartArray("stars");
			while (h.hasNextStar()) {

				HIP2Reader.HIP2Star s = h.getNextStar();

				generator.writeStartObject()
						.write("StarID", s.StarID)
						.write("right-ascension", s.RA)
						.write("declination", s.Decl)
						.write("parallax", s.parallax)
						.write("magnitude", s.magnitude)
						.writeEnd();
			}
			generator.writeEnd();
			generator.writeEnd();
			generator.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
