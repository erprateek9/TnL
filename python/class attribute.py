class Item :
    after_discount = 0.8 #class attribute
    def __init__(self: str ,name,price=0,quantity=0):
        #assertion
        assert price >=0 ,f'Price {price} - should be greater than Zero'
        assert quantity >=0,f'Quantity {quantity} - should be greater than Zero'
        
        #decleration
        self.name= name
        self.price=price
        self.quantity=quantity



    def calcualte_total_price(self):
        return self.price * self.quantity



item1=Item("mouse",55,3)
item2=Item("keyboard",77,44)

