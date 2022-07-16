package com.github.pojo.responseDto.search;

import java.util.ArrayList;

public class SearchRepositoryDto {
private String total_count;
private String incomplete_results;
private ArrayList<Item> items;
public String getTotal_count() {
	return total_count;
}
public void setTotal_count(String total_count) {
	this.total_count = total_count;
}
public String getIncomplete_results() {
	return incomplete_results;
}
public void setIncomplete_results(String incomplete_results) {
	this.incomplete_results = incomplete_results;
}
public ArrayList<Item> getItems() {
	return items;
}
public void setItems(ArrayList<Item> items) {
	this.items = items;
}
public SearchRepositoryDto(String total_count, String incomplete_results, ArrayList<Item> items) {
	super();
	this.total_count = total_count;
	this.incomplete_results = incomplete_results;
	this.items = items;
}
public SearchRepositoryDto() {
	super();
}

}
