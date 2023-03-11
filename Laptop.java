public class Laptop {
    String model;
    int ram;
    int sizeHDD;
    String operationSistem;
    String color;
    int price;
    
    public Laptop(String name, int ram, int sizeHDD, String operationSistem, String color, int price) {
        this.model = name;
        this.ram = ram;
        this.sizeHDD = sizeHDD;
        this.operationSistem = operationSistem;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [model = " + model + ", ram = " + ram + ", sizeHDD = " + sizeHDD + ", operationSistem = " + 
            operationSistem + ", color = " + color + ", price = " + price + "]\n";
    }
    
    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSizeHDD() {
        return sizeHDD;
    }

    public void setSizeHDD(int sizeHDD) {
        this.sizeHDD = sizeHDD;
    }

    public String getOperationSistem() {
        return operationSistem;
    }

    public void setOperationSistem(String operationSistem) {
        this.operationSistem = operationSistem;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ram;
        result = prime * result + sizeHDD;
        result = prime * result + ((operationSistem == null) ? 0 : operationSistem.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model != other.model)
            return false;
        if (ram != other.ram)
            return false;
        if (sizeHDD != other.sizeHDD)
            return false;
        if (operationSistem == null) {
            if (other.operationSistem != null)
                return false;
        } else if (!operationSistem.equals(other.operationSistem))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}
