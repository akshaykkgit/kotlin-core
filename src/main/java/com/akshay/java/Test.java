package com.akshay.java;

import annotation.MyClass;
import annotation.Myclass2;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        // Your JSON string
        String json = "searchResult\":[{\"EVENT_MARKERS\":[{\"EVT_flash_usage_nvram_free_split_Time\":\"2023-10-16T10:03:00\",\"EVT_flash_usage_nvram_free_split\":\"Flash Usage:Free:13.6M\"},{\"EVT_flash_usage_nvram_percentage_split_Time\":\"2023-10-16T10:03:00\",\"EVT_flash_usage_nvram_percentage_split\":\"Flash Usage:Percentage:6\"},{\"EVT_flash_usage_nvram_total_split_Time\":\"2023-10-16T10:03:00\",\"EVT_flash_usage_nvram_total_split\":\"Flash Usage:Total:15.3M\"},{\"EVT_flash_usage_nvram_used_split_Time\":\"2023-10-16T10:03:00\",\"EVT_flash_usage_nvram_used_split\":\"Flash Usage:Used:888.0K\"}]},{\"BaseMacAddress\":\"18:58:80:95:a0:ce\"},{\"LastRebootReason\":\"HW or Power-On Reset\"},{\"ModelName\":\"SMART5TYPA\"},{\"ProcessNumberOfEntries\":\"176\"},{\"Profile\":\"RDKB\"},{\"mac\":\"18:58:80:95:A0:CE\"},{\"SerialNumber\":\"90100000000J210020505\"},{\"erouterIpv4\":\"10.0.20.107\"},{\"erouterIpv6\":\"2001:db9::1a58:80ff:fe95:a0d8\"},{\"PartnerId\":\"telekom-de-test\"},{\"AccountId\":\"Unknown\"},{\"Version\":\"002.020.000\"},{\"Time\":\"2023-10-16 10:04:01\"}]}";
        String keyToExtract = "EVT_flash_usage_nvram_free_split";
        // Define the regular expression pattern to match the value associated with the key
        Pattern pattern = Pattern.compile("\"" + keyToExtract + "\":\"(.*?)\"");
        // Create a Matcher
        Matcher matcher = pattern.matcher(json);
        // Find the match and extract the value associated with the specified key
        if (matcher.find()) {
            String value = matcher.group(1);
            System.out.println(value);
        }
    }
}


//        MyClass obj=new MyClass();
//        System.out.println(obj.myField);
//        obj.setField2(3);
//        System.out.println(obj.getField2());
//
//        System.out.println(MyClass.staticMethod());
//        System.out.println(MyClass.Companion.staticMethod());
//
//        Myclass2 obj2=new Myclass2("Akshay");
//        System.out.println(obj2.toString());
//
//        Myclass2 obj3=new Myclass2("Akshay",31);
//        System.out.println(obj3.toString());



//    }
//}
