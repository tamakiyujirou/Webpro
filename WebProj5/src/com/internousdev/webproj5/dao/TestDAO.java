package com.internousdev.webproj5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.webproj5.dto.LoginDTO;
import com.internousdev.webproj5.util.DBConnector;

public class TestDAO {

	public List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	public int insert(String username, String password){
		int ret = 0;
		DBConnector db = new DBConnector();
	}

}
