package fr.insee.onyxia.model.catalog.Config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Config
 */
public class Config {

    private String type;
    private Category properties;
    private List<String> required = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Category getProperties() {
        return properties;
    }

    public void setProperties(Category properties) {
        this.properties = properties;
    }

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

}