package com.cg.delightorder.dao;

import com.cg.delightorder.dto.RawMaterialStockBean;

public interface RawMaterialDao 
{
	public String trackRawMaterialOrder(RawMaterialStockBean RawmaterialStock);
	public boolean processDateCheck(RawMaterialStockBean RawmaterialStock);
	public String updateExitDateinStock(RawMaterialStockBean RawmaterialStock);
	public String updateRawMaterialStock(RawMaterialStockBean RawmaterialStock);
	public boolean doesRawMaterialOrderIdExistInStock(String orderId);
}
