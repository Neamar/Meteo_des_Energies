package fr.neamar.meteodesenergies.pojo;

import org.json.JSONObject;

public class Energy {
    public String name;
    public int energyValue;
    public double co2Value;
    public String type;

    Energy(JSONObject jsonObject) {
        name = jsonObject.optString("name");
        energyValue = jsonObject.optInt("energyValue");
        co2Value = jsonObject.optDouble("co2value");
        type = jsonObject.optString("type");
    }
}
