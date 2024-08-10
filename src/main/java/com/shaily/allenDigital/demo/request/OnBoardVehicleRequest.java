package com.shaily.allenDigital.demo.request;

import com.shaily.allenDigital.demo.entity.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OnBoardVehicleRequest {

    protected Vehicle vehicle;
}
