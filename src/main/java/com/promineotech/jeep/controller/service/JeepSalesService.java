/**
 * 
 */
package com.promineotech.jeep.controller.service;

import java.util.List;
import com.promineotech.jeep.entity.Jeep;

/**
 * @author 17015
 *
 */
public interface JeepSalesService {

  /**
   * @param model
   * @param trim
   * @return
   */
  List<Jeep> fetchJeeps(String model, String trim);

}
