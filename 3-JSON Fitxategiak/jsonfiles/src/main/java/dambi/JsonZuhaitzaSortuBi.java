package dambi;
import javax.json.Json;
import javax.json.JsonObject;

import javax.json.JsonArray;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonString;
import javax.json.JsonValue;

public class JsonZuhaitzaSortuBi {

public static void main(String[] args) {
	

	JsonObject model = Json.createObjectBuilder()
		.add("id", "file")		
		.add("id", "file")
		.add("popup", Json.createObjectBuilder()
			.add("menuitem", Json.createArrayBuilder()
				.add(Json.createObjectBuilder()
					.add("Value", "New")
					.add("onClick", "createnewdoc"))

				.add(Json.createObjectBuilder()
					.add("Value", "Open")
					.add("onClick", "opendoc"))
				
				.add(Json.createObjectBuilder()
					.add("Value", "Close")
					.add("onClick", "closedoc"))))
			.build();
		System.out.println(model);
}

}
