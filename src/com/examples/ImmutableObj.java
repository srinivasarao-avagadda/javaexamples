package com.examples;

import java.util.ArrayList;

public final class ImmutableObj {
    // declared private final instance variable
    private final String countryName;
    // Mutable object
    private final ArrayList listOfStates;

    public ImmutableObj(String countryName, ArrayList listOfStates) {
        super();
        this.countryName = countryName;
        // Creating deep copy for mutable object
        /*
         * ArrayList tempList = new ArrayList();
         * 
         * for (int i = 0; i < listOfStates.size(); i++) {
         * tempList.add(listOfStates.get(i));
         * }
         * this.listOfStates = tempList;
         */

        this.listOfStates = listOfStates;
    }

    public String getCountryName() {
        // Do not need to do cloning as it is immutable object
        return countryName;
    }

    public ArrayList getListOfStates() {
        // Returning cloned object
        return (ArrayList) listOfStates.clone();
    }

    public static void main(String args[]) {
        ArrayList listOfStates = new ArrayList();
        listOfStates.add("Madhya Pradesh");
        listOfStates.add("Maharastra");
        listOfStates.add("Gujrat");
        String countryName = "India";
        ImmutableObj immutableObj = new ImmutableObj(countryName, listOfStates);
        System.out.println("Country : " + immutableObj.getCountryName());
        // Lets try to change local variable countryName
        countryName = "China";
        System.out.println("Updated Country : " + immutableObj.getCountryName());
        System.out.println("List of states : " + immutableObj.getListOfStates());
        // It will not be added to the list because we are using clone in
        // getListOfStates
        immutableObj.getListOfStates().add("Kerala");
        // It will not be added to the list because we are using deep copy in
        // constructor
        listOfStates.add("Rajasthan");
        System.out.println("Updated List of states : " + immutableObj.getListOfStates());

    }

}
