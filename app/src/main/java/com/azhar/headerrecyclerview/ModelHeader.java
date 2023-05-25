package com.azhar.headerrecyclerview;

/**
 * Created by Azhar Rivaldi on 06-04-2023
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * LinkedIn : https://www.linkedin.com/in/azhar-rivaldi
 */

public class ModelHeader implements TypeListItem {
    String strHeader;

    public ModelHeader(String strHeader) {
        this.strHeader = strHeader;
    }

    public String getHeader() {
        return strHeader;
    }

    public void setHeader(String strHeader) {
        this.strHeader = strHeader;
    }

    @Override
    public int getItemType() {
        return TypeListItem.TYPE_HEADER;
    }
}
