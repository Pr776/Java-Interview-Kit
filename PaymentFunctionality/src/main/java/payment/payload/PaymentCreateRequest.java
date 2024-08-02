package payment.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;

@Data
@ApiModel(value = "PaymentRequestDTO", description = "Parameters required for a payment")
public class PaymentCreateRequest {

    @ApiModelProperty(notes = "name of the payment",required = true)
    @NotBlank(message = "User name is required")
    private String name;



}
