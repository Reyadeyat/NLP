/*
 * Copyright (C) 2022 Reyadeyat
 *
 * Reyadeyat/NLP is licensed under the
 * BSD 3-Clause "New" or "Revised" License
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://reyadeyat.net/NLP.LICENSE 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.reyadeyat.nlp.json;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mohammad Nabil Mostafa
 * <a href="mailto:code@reyadeyat.net">code@reyadeyat.net</a>
 * 
 * @since 2023.01.01
 */
public class JsonTimeZoneAdapter extends TypeAdapter<Instant> {

    @Override
    public Instant read(JsonReader json_reader) throws IOException {
        String timestamp = json_reader.nextString();
        timestamp = timestamp + "000000".substring(0, 26-timestamp.length());
        Instant instant = Instant.from(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS").withZone(ZoneOffset.UTC).parse(timestamp));
        return instant;
    }

    @Override
    public void write(JsonWriter json_writer, Instant instant) throws IOException {
        String timestamp = instant.toString().replace("T", " ").replace("Z", "");
        json_writer.value(timestamp);
    }
}
