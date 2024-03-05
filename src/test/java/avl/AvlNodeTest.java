package avl;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created with IntelliJ IDEA. User: Antonio J. Nebro Date: 09/07/13 Time: 15:29
 */
@DisplayName("Class AvlNode ")
public class AvlNodeTest {

  @Test
  @DisplayName("is instantiated with new AvlNode()")
  void isInstantiatedWithNew() {
    assertNotNull(new AvlNode<>(1));
  }

  private AvlNode<Integer> node;

  @Nested
  @DisplayName("when the constructor() method is invoked with the parameter 1")
  class TestCasesForIntValues {
    @BeforeEach
    public void setUp() {
      node = new AvlNode<Integer>(1);
    }

    @AfterEach
    public void tearDown()  {
      node = null;
    }

    @Test
    void theNodeParametersAreCorrectlySet() {
      assertNull(node.getLeft()) ;
      assertNull(node.getRight()) ;
      assertNull(node.getParent()) ;
      assertNull(node.getClosestNode()) ;
      assertEquals(1, node.getItem());
    }

    @Test
    void theConstructorDoesNotReturnAWrongItem() {
      int wrongExpectedItem = 2 ;
      assertNotEquals(wrongExpectedItem, node.getItem() == 2);
    }
  }


/*

  @BeforeEach
  public void setUp() throws Exception {
    node = new AvlNode<Integer>(5);
  }

  @AfterEach
  public void tearDown() throws Exception {
    node = null;
  }

  @Test
  public void constructShouldCreateANode() {
    assertNotNull(new AvlNode<>(1));
  }

  @Test
  void testHasLeft() {
    assertFalse(node.hasLeft());
    AvlNode<Integer> node2 = new AvlNode<Integer>(6);
    node.setLeft(node2);
    assertTrue(node.hasLeft());
  }

  @Test
  void testHasRight() {
    assertFalse(node.hasRight());
    AvlNode<Integer> node2 = new AvlNode<Integer>(6);
    node.setRight(node2);
    assertTrue(node.hasRight());
  }

  @Test
  void shouldSetHeight() {
    int expectedHeight = 1000213;
    node.setHeight(expectedHeight);
    assertEquals(expectedHeight, node.getHeight(),"Height is different from expected.");
  }

 */
}
