package kamieshi.com.kankulatorbykamieshi;
import java.math.*;
/**
 * Created by Local on 30.10.2017.
 */

public class FunctionCalculator {

    public  Double mainfunBinar(int id,double first,double last) {
      switch (id)
      {
        case 1:
            return first+last;
          case 2:
              return first-last;
          case 3:
              return  first*last;
          case 4:
              return  first/last;
          case 5:
              return Math.pow(first,last);
      }
      return last;

}

public  Double mainfunUnar(int id,double first)
{
    switch (id)
    {
        case 1:
            return 3.14;
        case 2:
            return Math.sin(first);
        case 3:
            return Math.cos(first);
        case 4:
            return Math.sqrt(first);
    }
    return  first;
}



}
