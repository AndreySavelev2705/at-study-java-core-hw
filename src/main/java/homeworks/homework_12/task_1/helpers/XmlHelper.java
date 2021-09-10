package homeworks.homework_12.task_1.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import homeworks.homework_12.task_1.model.Generatable;

public class XmlHelper implements SerializeHelper{

    @Override
    public Generatable deserialize(String data, Class clazz) {
        XmlMapper xmlMapper = new XmlMapper();

        try {
            return (Generatable) xmlMapper.readValue(data, clazz);
        } catch (JsonProcessingException jpe) {
            throw new RuntimeException("Невозможно десериализовать объект");
        }
        //return ;
    }

    @Override
    public String serialize(Generatable object) {
        XmlMapper xmlMapper = new XmlMapper();

        try {
            return xmlMapper.writeValueAsString(object);
        } catch (JsonProcessingException jpe) {
            //throw new RuntimeException("Невозможно сериализовать объект");
            throw new RuntimeException(jpe);
        }
    }
}
