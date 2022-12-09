import NewFormConstruction from "../src/components/FormConstruction/newConstruction";
import Nav from "../src/components/Nav";
import Footer from "../src/components/patterns/Footer";
import HeadComponent from "../src/components/patterns/Head";
import styles from '../styles/Home.module.css'

export default function NewConstruction() {
  return (
    <div >
      <HeadComponent />
      <Nav />
      <NewFormConstruction/>
      <Footer style={styles.footer} />
    </div>
  )
}