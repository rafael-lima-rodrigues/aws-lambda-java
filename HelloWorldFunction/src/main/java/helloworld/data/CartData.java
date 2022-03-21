package helloworld.data;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartData extends APIGatewayProxyRequestEvent {
    private double sum;
    private String couponCode;

}
