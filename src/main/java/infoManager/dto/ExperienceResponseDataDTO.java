package infoManager.dto;

import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import infoManager.model.UserRole;

@Data
public class ExperienceResponseDataDTO {

  @ApiModelProperty(position = 0)
  private Integer id;
  @ApiModelProperty(position = 1)
  private String username;
  @ApiModelProperty(position = 2)
  private String topic;
  @ApiModelProperty(position = 3)
  private String content;
  @ApiModelProperty(position = 4)
  private Date date;

}
