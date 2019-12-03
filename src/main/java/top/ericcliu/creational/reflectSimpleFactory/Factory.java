package top.ericcliu.creational.reflectSimpleFactory;

/**
 * @author liubi
 **/
public class Factory {
  public static AbstractProduct getInstance(String className){
      AbstractProduct f=null;
      try {
          f = (AbstractProduct) Class.forName(className).newInstance();
      } catch (IllegalAccessException e) {
          e.printStackTrace();
      } catch (InstantiationException e) {
          e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
      return f;
  }
}
