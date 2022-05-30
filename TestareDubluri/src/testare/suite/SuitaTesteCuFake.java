package testare.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testare.categorii.TesteBoundary;
import testare.categorii.TesteCuFake;
import testare.categorii.TestePoateRezerva;
import testare.teste.AgentieTurismTest;
import testare.teste.PachetTuristicTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(TesteCuFake.class)
@Categories.ExcludeCategory({TesteBoundary.class, TestePoateRezerva.class})
public class SuitaTesteCuFake {

}
