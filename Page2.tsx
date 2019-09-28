import React, { Component } from "react";
import { View, Text, Button, Image } from "react-native";
import styles from "./GlobalStyles";

export default class Page2 extends Component {

    render() {
        let src = require('./img/emoji_01.png');
        return(
            <View style={styles.Container}>
                <Image
                    style={{width: 50, height: 50, resizeMode: 'cover'}}
                    source={src}
                    />
                <Text>{'page2'}</Text>
            </View>
        );
    }
}