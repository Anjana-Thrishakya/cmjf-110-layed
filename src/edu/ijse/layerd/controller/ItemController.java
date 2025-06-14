/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.controller;

import edu.ijse.layerd.dto.ItemDto;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class ItemController {
    public String saveItem(ItemDto itemDto) throws Exception{
        return "Success";
    }
    
    public String updateItem(ItemDto itemDto) throws Exception{
        return "Success";
    }
    
    public String deleteItem(String code) throws Exception{
        return "Success";
    }
    
    public ItemDto searchItem(String code) throws Exception{
        return null;
    }
    
    public ArrayList<ItemDto> getAllItem() throws Exception{
        return null;
    }
    
    
}
