#import abc
from abc import ABC, abstractmethod
import math

class Shape(ABC):

    def __init__(self, width, height):
        self.width = width
        self.height = height

    @abstractmethod
    def perimeter(self):
        pass

    @abstractmethod
    def area(self):
        pass


class Triangle(Shape):

    def __init__(self, width, height, side):
        super().__init__(width, height)
        self.side = side

    def perimeter(self):
        return self.height + self.width + self.side


    def area(self):
        p = (self.perimeter()) / 2.0
        return math.sqrt(p*(p-self.width)*(p-self.height)*(p-self.side))

    def __str__(self) -> str:
        return f'Triangle({self.width}, {self.height}, {self.side}, perimeter={self.perimeter()}, area={self.area()})'

class Rectangle(Shape):

    def __init__(self, width, height):
        super().__init__(width, height)


    def perimeter(self):
        return 2 * (self.height + self.width)


    def area(self):
        return self.height * self.width

    def __str__(self) -> str:
        return f'Rectangle({self.width}, {self.height}, perimeter={self.perimeter()}, area={self.area()})'


if __name__ == '__main__':
    r = Rectangle(10, 15)
    t = Triangle(6, 8, 10)

    print(r)
    print(t)