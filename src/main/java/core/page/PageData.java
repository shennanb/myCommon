package core.page;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class PageData<T> {

    private Page page;

    private List<T> list;

}
