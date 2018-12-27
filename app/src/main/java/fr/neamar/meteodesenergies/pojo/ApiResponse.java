package fr.neamar.meteodesenergies.pojo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class ApiResponse {
    public double carbonEmissions;
    public double currentGauge;
    public ArrayList<Energy> energyMix;

    public ApiResponse(JSONObject jsonObject) {
        carbonEmissions = jsonObject.optDouble("carbonEmissions");
        currentGauge = jsonObject.optDouble("currentGauge");

        JSONArray energies = jsonObject.optJSONArray("energyMix");

        for (int i = 0; i < energies.length(); i++) {
            energyMix.add(new Energy(energies.optJSONObject(i)));
        }
    }
}
