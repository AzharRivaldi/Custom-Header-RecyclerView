package com.azhar.headerrecyclerview;

/**
 * Created by Azhar Rivaldi on 06-04-2023
 * Youtube Channel : https://bit.ly/2PJMowZ
 * Github : https://github.com/AzharRivaldi
 * Twitter : https://twitter.com/azharrvldi_
 * Instagram : https://www.instagram.com/azhardvls_
 * LinkedIn : https://www.linkedin.com/in/azhar-rivaldi
 */

public class ModelItem implements TypeListItem {
    String strItem;

    public ModelItem(String strItem) {
        this.strItem = strItem;
    }

    public String getItem() {
        return strItem;
    }

    public void setItem(String strItem) {
        this.strItem = strItem;
    }

    @Override
    public int getItemType() {
        return TypeListItem.TYPE_ITEM;
    }
}
