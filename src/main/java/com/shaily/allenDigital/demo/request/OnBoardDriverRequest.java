package com.shaily.allenDigital.demo.request;

import com.shaily.allenDigital.demo.entity.Driver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OnBoardDriverRequest {

    protected Driver driver;
}
