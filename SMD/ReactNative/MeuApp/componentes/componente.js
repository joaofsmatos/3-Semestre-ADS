import { View } from "react-native";

export default function (bt) {
    const [getNum, setNum] = useState('');
    if(bt.numero == 1) {
        setNum(1)
    }
    if(bt.numero == 2) {
        setNum(2)
    }if(bt.numero == 3) {
        setNum(3)
    }if(bt.numero == 4) {
        setNum(4)
    }if(bt.numero == 5) {
        setNum(5)
    }if(bt.numero == 6) {
        setNum(6)
    }if(bt.numero == 7) {
        setNum(7)
    }if(bt.numero == 8) {
        setNum(8)
    }if(bt.numero == 9) {
        setNum(9)
    }if(bt.numero == 0) {
        setNum(0)
    }
    return (
        <View> 
            <Text>{getNum}</Text>
        </View>
    );
}