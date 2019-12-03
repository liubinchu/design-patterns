package top.ericcliu.structural.decorator;

public abstract class Decorator implements Component {
    Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation()
    {
        if (component != null)
        {
            component.Operation();
        }
    }
}