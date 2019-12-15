package model.entity.tax;

public interface Tax {
    int MAX_NUMBER_OF_CHILDREN_TO_COUNT_EXEMPTION = 7;
    double MAX_EXEMPTION_FOR_CHILDREN = 0.7;
    double countTaxToPay();
    double countChildrenExemption();
}
