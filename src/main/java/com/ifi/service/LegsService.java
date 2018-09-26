/*
 * Created on 2018-09-26 ( Date ISO 2018-09-26 - Time 17:02:17 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.service;

import com.ifi.entity.Legs;
import java.util.List;

public interface LegsService {

	public Legs getOne(Integer legId);

	public List<Legs> findAll();

	public Boolean delete(Integer legId);

	public Legs create(Legs legs);

	public Legs update(Legs legs);

	public Boolean exist(Legs legs);
}
