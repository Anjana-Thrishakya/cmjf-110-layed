/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layerd.service.custom.impl;

import edu.ijse.layerd.dto.ItemDto;
import edu.ijse.layerd.entity.ItemEntity;
import edu.ijse.layerd.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class ItemServiceImpl implements ItemService{

    @Override
    public String saveItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(itemDto.getCode(),
                itemDto.getDesc(), itemDto.getPack(),
                itemDto.getUnitPrice(), itemDto.getQoh());
        
        boolean isSaved = true;
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String updateItem(ItemDto itemDto) throws Exception {
        ItemEntity itemEntity = new ItemEntity(itemDto.getCode(),
                itemDto.getDesc(), itemDto.getPack(),
                itemDto.getUnitPrice(), itemDto.getQoh());
        
        boolean isUpdate = true;
        return isUpdate ? "Success" : "Fail";
    }

    @Override
    public String deleteItem(String itemCode) throws Exception {
        
        boolean isDeleted = true;
        return  isDeleted ? "Success" : "Fail";
    }

    @Override
    public ItemDto searchItem(String itemCode) throws Exception {
        ItemEntity itemEntity = null;
        if(itemEntity != null){
            return new ItemDto(itemEntity.getCode(), 
                    itemEntity.getDesc(), 
                    itemEntity.getPack(),
                    itemEntity.getUnitPrice(),
                    itemEntity.getQoh());
        }
        
        return null;
    }

    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
        ArrayList<ItemEntity> itemEntitys = null;
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        if(itemEntitys != null){
            for (ItemEntity itemEntity : itemEntitys) {
                itemDtos.add(new ItemDto(itemEntity.getCode(), 
                    itemEntity.getDesc(), 
                    itemEntity.getPack(),
                    itemEntity.getUnitPrice(),
                    itemEntity.getQoh()));
            }
        }
        
        return itemDtos;
    }
    
}
