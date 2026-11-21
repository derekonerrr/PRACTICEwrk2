package pr6.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop {
    private final List<Computer> computers = new ArrayList<>();
    public void addComputer(Computer computer) { computers.add(computer); }
    public boolean removeComputer(String model) {
        return computers.removeIf(c -> c.getModel().equalsIgnoreCase(model));
    }
    public Optional<Computer> findComputer(String model) {
        return computers.stream().filter(c -> c.getModel().equalsIgnoreCase(model)).findFirst();
    }
    public List<Computer> getComputers() { return List.copyOf(computers); }
}
