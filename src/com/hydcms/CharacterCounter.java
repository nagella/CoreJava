package com.hydcms;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter{
  static  String message = "";
    public CharacterCounter(String message){
        this.message = message;
    }

    public Character getCharacter(){

        HashMap<Character, Integer> charCountMap = new HashMap<>();
        Map.Entry<Character, Integer> mfc = null;

        message = message.replaceAll("\\s","").toLowerCase();
        char charArray [] = message.toCharArray();

        for(char c: charArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }
        System.out.println(charCountMap);
        for(Map.Entry<Character,Integer> mapEntry:charCountMap.entrySet()){

            if(mfc == null || mapEntry.getValue().compareTo(mfc.getValue())>0){
                mfc = mapEntry;

            }
        }
        return mfc.getKey();
    }
}
