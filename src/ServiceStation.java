public class ServiceStation implements Service {

    @Override
    public void service(Transport transport) {
        System.out.println("Начинаем сервис!");
        transport.service();
        System.out.println("Сервис окончен!");
    }
}