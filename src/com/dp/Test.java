package com.dp;


public class Test {
    public static void main(String args[]){
        String [] onchain = {"/blockchain-poc/v1/financier/salesAgreement/","/blockchain-poc/v1/dealer/Dealer-Sales-Agreement-accept/","/blockchain-poc/v1/dealer/getSalesAgreement/"};
        String blockchainApi;
        String api = "/blockchain-poc/v1/financier/salesAgreement/SAD";
        if(stringContainsItemFromList(api,onchain)){
            blockchainApi = "Onchain";
        }else{
            blockchainApi = "Offchain";
        }
    }

    public static boolean stringContainsItemFromList(String inputStr, String[] items) {
        boolean flag = false;
        for(String item: items){
            flag = inputStr.contains(item);
            if(flag == true){
                break;
            }
        }
        return flag;
    }
}
