//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.dataformat.csv.CsvMapper;
//import com.fasterxml.jackson.dataformat.csv.CsvSchema;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//
//public class CsvToJson {
//    public String csvToJson(String csv) {
//        try {
//            CsvSchema csvSchema = CsvSchema.builder ( ).setUseHeader (true).build ( );
//            CsvMapper csvMapper = new CsvMapper ( );
//            List<Object> readAll = null;
//            readAll = csvMapper.readerFor (Map.class).with (csvSchema).readValues (csv).readAll ( );
//            ObjectMapper mapper = new ObjectMapper ( );
//            return mapper.writerWithDefaultPrettyPrinter ( ).writeValueAsString (readAll);
//        } catch (IOException e) {
//            e.printStackTrace ( );
//            return null;
//        }
//    }
//
//}
