package com.example.testing.weather;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double avgTemperature(){

        double tmp = 0;
        int iterations = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            tmp=tmp+temperature.getValue();
            iterations++;
        }

        double result = tmp/iterations;
        return result;
    }

    public double medianTemperature(){

        ArrayList<Double> inOrder = new ArrayList<>();
        double median = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            inOrder.add(temperature.getValue());
        }

        Collections.sort(inOrder);
        int size = inOrder.size();

        for(double tmp : inOrder){
            if(size % 2 == 1){
                median = inOrder.get((size + 1) / 2 - 1);
            }else{
                median = (inOrder.get(size/2-1) + inOrder.get(size/2))/2;
            }
        }

        return median;
    }
}
