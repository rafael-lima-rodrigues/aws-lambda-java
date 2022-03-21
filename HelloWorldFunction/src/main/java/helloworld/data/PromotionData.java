package helloworld.data;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PromotionData extends APIGatewayProxyResponseEvent {

    private double reducePrice;
    private boolean freeShipping;
    private String promoMsg;
}
