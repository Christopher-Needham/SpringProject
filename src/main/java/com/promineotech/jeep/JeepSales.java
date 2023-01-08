package com.promineotech.jeep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.promineotech.ComponantScanMarker;

/**
 * @author 17015
 *
 */

  @SpringBootApplication(scanBasePackageClasses = { ComponantScanMarker.class})
public class JeepSales {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
      SpringApplication.run(JeepSales.class, args);

  }

}
